/*
 * Copyright (c) 2012-2021 Arne Schwabe
 * Distributed under the GNU GPL v2 with additional terms. For full terms see the file doc/LICENSE.txt
 */

package de.blinkt.openvpn

import android.app.Activity
import android.net.VpnService
import android.os.Bundle
import android.os.RemoteException
import android.util.Log
import de.blinkt.openvpn.core.ConfigParser
import de.blinkt.openvpn.core.ConfigParser.ConfigParseError
import de.blinkt.openvpn.core.ProfileManager
import de.blinkt.openvpn.core.VPNLaunchHelper
import kotlinx.android.synthetic.main.activity_main.*
import java.io.IOException
import java.io.StringReader

class MainActivity : Activity() {

    private val debugTag = "test_"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start.setOnClickListener {
            startVpn(Constants.VPN_CONFIG)
        }
    }

    private fun startVpn(inlineConfig: String) {

        val intent = VpnService.prepare(this)
        intent?.let {
            startActivityForResult(it, 100);
        }

        val cp = ConfigParser()
        try {
            cp.parseConfig(StringReader(inlineConfig))
            val vp = cp.convertProfile() // Analysis.ovpn

            vp.mName = "Faifly"
            if (vp.checkProfile(this) != R.string.no_error_found) {
                throw RemoteException(this.getString(vp.checkProfile(this)))
            }
            vp.mProfileCreator = this.packageName
            vp.mUsername = "UVPNv2-45cd50bb0594e885bfd9ff56f9dc8d3457a41cbbd1d9554e25a4fd2377cd1733&vlad.keda+ud3@faifly.com"
            vp.mPassword = "453f993f56d6c681935f2c4a3e2d8bf17ab0522a58e9faa8aa48d8b1e67c2210"
            ProfileManager.setTemporaryProfile(this, vp)
            VPNLaunchHelper.startOpenVpn(vp, this)
        } catch (e: IOException) {
            Log.v(debugTag, "caught IOException")
            throw RemoteException(e.message)
        } catch (e: ConfigParseError) {
            Log.v(debugTag, "caught ConfigParseError")
            throw RemoteException(e.message)
        }
    }
}
