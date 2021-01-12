/*
 * Copyright (c) 2012-2021 Arne Schwabe
 * Distributed under the GNU GPL v2 with additional terms. For full terms see the file doc/LICENSE.txt
 */

package de.blinkt.openvpn;

public abstract class Constants {

    public static String VPN_CONFIG = "dev tun\n" +
            "persist-key\n" +
            "persist-tun\n" +
            "nobind\n" +
            "remote 167.99.207.213 1194\n" +
            "proto tcp\n" +
            "pull\n" +
            "tls-client\n" +
            "verify-x509-name test-location.uvpn.me name\n" +
            "remote-cert-tls server\n" +
            "tun-mtu 1500\n" +
            "client\n" +
            "cipher AES-256-CBC\n" +
            "keysize 256\n" +
            "auth SHA512\n" +
            "auth-nocache\n" +
            "tls-version-min 1.2\n" +
            "tls-cipher TLS-DHE-RSA-WITH-AES-256-GCM-SHA384:TLS-DHE-RSA-WITH-AES-256-CBC-SHA256:TLS-DHE-RSA-WITH-AES-128-GCM-SHA256:TLS-DHE-RSA-WITH-AES-128-CBC-SHA256\n" +
            "sndbuf 524288\n" +
            "rcvbuf 524288\n" +
            "mssfix 1200\n" +
            "resolv-retry infinite\n" +
            "comp-lzo\n" +
            "nobind\n" +
            "\n" +
            "mute-replay-warnings\n" +
            "verb 3\n" +
            "auth-user-pass\n" +
            "\n" +
            "<ca>\n" +
            "-----BEGIN CERTIFICATE-----\n" +
            "MIIDHjCCAgagAwIBAgIJAO9S1h0kLv21MA0GCSqGSIb3DQEBCwUAMA8xDTALBgNV\n" +
            "BAMMBHVWUE4wHhcNMTkwNjAzMDcwNDI3WhcNMzkxMjE1MDcwNDI3WjAPMQ0wCwYD\n" +
            "VQQDDAR1VlBOMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA4e26rXeJ\n" +
            "cUxyCBx+bUWp0KaI0tU41tWwSD59X5g9Wbz5zTIJMWvCKoYgX4T+x35TDqMDqRwC\n" +
            "CzSpMhXRn9o53wkkLEo1vxDtgXlCN6FleAnprf7qEa3rLnzrltdLw/GWE2Fwl8zj\n" +
            "D8R6lAQMDb8IDaK4vM7bzXIX4HYKv5nKoOTUJTLekIUvtOiCUVi8ZZnxj5tmWeYL\n" +
            "lv15finKc+rw8qd7Los1fNcCPMQtwCFDrFBk17xI74VKuiKS0fFonXPrALnQ/q4V\n" +
            "xne28daS95qeq0mzL3wINitID76x/Qq/dPIN9+gD57rFw7GedwZk+TdVwMVyQUgj\n" +
            "Tahfgw4r0qrzywIDAQABo30wezAdBgNVHQ4EFgQUU82oLJIJ5mXJ/HhkoSPzGlCt\n" +
            "W/4wPwYDVR0jBDgwNoAUU82oLJIJ5mXJ/HhkoSPzGlCtW/6hE6QRMA8xDTALBgNV\n" +
            "BAMMBHVWUE6CCQDvUtYdJC79tTAMBgNVHRMEBTADAQH/MAsGA1UdDwQEAwIBBjAN\n" +
            "BgkqhkiG9w0BAQsFAAOCAQEAHxVOnPDcvC4q73RkPPOinoAJ1ujCKUbkU9uogW2A\n" +
            "W8cXxJediMFXKHdu3wBpVDQZz2DRN5iwdjJANd7u7MFMvVAdDK9rG8owCPTnD6Ka\n" +
            "GW3mOCuuAQ0WVIJV3O4SxxQyckI+e7M6IIZigP6APbhLr5qxVF71bIfx225P/oMN\n" +
            "4MeXpKEG2t/eD60FTOKu2UX5RYNjlNsBPcBPvBsQAiRnFpg/Naw38KElzmzWH3eL\n" +
            "gXKs4WvOW9GFQ3h75UoacfLrywUiB1wY431xy6H8TONOq5z72sMFBQ+Php6ey0s1\n" +
            "n2LkvPV2SYH2UP5veN/xP2KT3HNtOL4TdmEKUCO+xPDyrA==\n" +
            "-----END CERTIFICATE-----\n" +
            "</ca>\n" +
            "<cert>\n" +
            "-----BEGIN CERTIFICATE-----\n" +
            "MIIDOzCCAiOgAwIBAgIQD5Z9uWfIMqq4XQnAyAzY0TANBgkqhkiG9w0BAQsFADAP\n" +
            "MQ0wCwYDVQQDDAR1VlBOMB4XDTE5MDYwMzA3MDcxNVoXDTIwMDYwMjA3MDcxNVow\n" +
            "ETEPMA0GA1UEAwwGY2xpZW50MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKC\n" +
            "AQEAs0Lf8GZ7G3XMggfV06jOoS00QdWX3xsm/Fd2Q0fgoczXevugSk7Rng1nIhRZ\n" +
            "weSaYrYbpq2xuW0jzZrLXYd3bC9yhAt+KnwFFYbD1KadVPbwmeUfWWjAxpe7kwZc\n" +
            "sFqah9OWJcb0tHAy79tm0S0Z1UQvH8MlSWsGvER1GN8UL3GU4ASe52g5pFBcfDmt\n" +
            "LpWd9FFX+CDLfpJ2dj6N09QlE8zofKLTgnxTP8N+M7suzLZUOyQGUGbp8OjcKgYf\n" +
            "YZhMOmNu9K9efefmq3y+yoYiz7QIWLlaFpsdix7KTFuXe2LIIzmAaYUmJX99x3LD\n" +
            "ola+WcbzbEQLGNin591IRzWtvwIDAQABo4GQMIGNMAkGA1UdEwQCMAAwHQYDVR0O\n" +
            "BBYEFNX+/w2PnMhdBcHT3FHakaScu38OMD8GA1UdIwQ4MDaAFFPNqCySCeZlyfx4\n" +
            "ZKEj8xpQrVv+oROkETAPMQ0wCwYDVQQDDAR1VlBOggkA71LWHSQu/bUwEwYDVR0l\n" +
            "BAwwCgYIKwYBBQUHAwIwCwYDVR0PBAQDAgeAMA0GCSqGSIb3DQEBCwUAA4IBAQCF\n" +
            "uEvvK+OLVeq+Jz/9QTXIicbGssIOMKNddW628nxrt3GcccowgEvAjB6FkwgPF4js\n" +
            "mROPp+yWK+PnqlDy75qQZvLbjLQ+IAgd5L66Kaf2NrgnIjgSjaj7d2pdENZuYTEB\n" +
            "tVZurkU5vSzjN0TwwaGFKvd+Z9EXHykSdfS03rdKDPW8qxGIzTGGPT6oDTIdxmVn\n" +
            "clNsF4sqeAgKF6oSEQhvc3J2+MZivBronK0NWTCu+Ma+TBM/QUpTzhigpvapmwZy\n" +
            "saZEfy7B6msmvSLoV/zPolyoarc2OLIZO/wr7WPF1ZneEP+wnv3hniCdItvolF7s\n" +
            "sxSWcIN1e7FFeU5ZOJwQ\n" +
            "-----END CERTIFICATE-----\n" +
            "</cert>\n" +
            "<key>\n" +
            "-----BEGIN PRIVATE KEY-----\n" +
            "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCzQt/wZnsbdcyC\n" +
            "B9XTqM6hLTRB1ZffGyb8V3ZDR+ChzNd6+6BKTtGeDWciFFnB5JpithumrbG5bSPN\n" +
            "mstdh3dsL3KEC34qfAUVhsPUpp1U9vCZ5R9ZaMDGl7uTBlywWpqH05YlxvS0cDLv\n" +
            "22bRLRnVRC8fwyVJawa8RHUY3xQvcZTgBJ7naDmkUFx8Oa0ulZ30UVf4IMt+knZ2\n" +
            "Po3T1CUTzOh8otOCfFM/w34zuy7MtlQ7JAZQZunw6NwqBh9hmEw6Y270r1595+ar\n" +
            "fL7KhiLPtAhYuVoWmx2LHspMW5d7YsgjOYBphSYlf33HcsOiVr5ZxvNsRAsY2Kfn\n" +
            "3UhHNa2/AgMBAAECggEARa8FZmowCOit6w4orPK+ACGWYtEpDG19pjJJorXaOIts\n" +
            "aD5QfRJOoeYL5U+L5Ld83Ep2TUDQCYjHljFKRL1YSxHWrkXZcaJsR4XvskZiepjT\n" +
            "xr8uhI8YARsSq4CZn2RZFdvGTkEc9td2tY7QVRf3JtQujWZKpFOadq0V5+kv65DQ\n" +
            "ss2TQTVNxZiSbBSgLaX3POvtgG/7j0LCLFeBzU4lrDhNyb2SU1Uk4rDEX6BPCP5P\n" +
            "noTPwPUlM68u2+80JQQXnylggfQ8k9B1Qr6OunRVpNBk/gPd3TYJr9Y+mzMKVdlN\n" +
            "gz2HNSwk70PrQRmHkSIC4nFyJw1j6shuxzchJXsIQQKBgQDkAuELrJIuHG+lGkFy\n" +
            "Lj4yexkYVlJ89qpmiDA7iOUkIwbpPIoJcOmkQu0kO3Cj2ykkyGBWsJ0OJJ/enJCE\n" +
            "+o9HwiAOnYAH4f+v5gQm8axIkro6YL1+Zlqb3m9dEucBh+aD5fE3sAXlFsRKGCDL\n" +
            "NPQL5e0FOPHVHAREczigzbb5GQKBgQDJRA4ClNOQLy9L+dWzXJEXHbRtAhjyxiUQ\n" +
            "OGY0qTsaPUjFOpi6dsneYPxikU42w0YdbsfiNiXXsJZMqiM+UHGEar9rpFnrVDB5\n" +
            "JA0Ou5lCNddCWSp8NxstPzITNsk4aLyqNTZ+UTLIW9s2NPWtPIh629TmcBmgisDr\n" +
            "KA2ZUebAlwKBgAz77PzRMvHVRLZOLHPoFjqhr+gm4kOjeEimcLizLvlD1VzqyaGI\n" +
            "AIYOGZr6l4t9K3agwnutSwRHKaNvnvszmX0onNK4PVY1lG3b11iwYnMvh9NTNvc/\n" +
            "tOEzZXwTW3xG1OWl7nqRV4SYK01c2mE3/r2+tiSZ/Yt5MPUE6rCdhlHhAoGBAJ6I\n" +
            "UpjJ7dN2t0SbKC89zLNunH341vn0BaG/KxJz8q/6ceWZAFBv3RajQmnJltgf/IyW\n" +
            "hC+1Ax3gZKNCqLwe1Su+gcUiEgoBqKTjNr3SGyhCDKqgXYy2Q1vimWj1EI60QVe4\n" +
            "zpG1F9EmOYd7M8EfG0na+toAls8UPF1+kSehkadFAoGBAJR39cAukKmYJwzFZaaD\n" +
            "GDOOvyqTxcEJAEHj1ESUe/mxBaXp1gnYDALjShZgn5GWU23cs4v8sdpESDbDra3C\n" +
            "kh0SnL7TEfKfHqTeC3gbH8X7VMDufsIbXRaL0aHGtl9JzYF1PLcjrwsOhGGP9Ini\n" +
            "7DiT2VcIYLTsYEdfr7g0zI1d\n" +
            "-----END PRIVATE KEY-----\n" +
            "</key>\n" +
            "key-direction 1\n" +
            "<tls-auth>\n" +
            "#\n" +
            "# 2048 bit OpenVPN static key\n" +
            "#\n" +
            "-----BEGIN OpenVPN Static key V1-----\n" +
            "1fc3d1058b7bcefd2b0a9009c155e641\n" +
            "111c77dae3c1e88e602ea054bd83c0a1\n" +
            "4287d8695ed519e378e6f07adb7c647d\n" +
            "cf5c4065d4d760f7d89f218b630d3844\n" +
            "34316a4de07f20b0487680bba1206945\n" +
            "be85b008bf7b0ad05d5aefdb3981290f\n" +
            "6eb00910b258fc58f449ff7503fc85eb\n" +
            "ad618f0c5a5c1398daa341cd7a3c8261\n" +
            "2bcaf691388706ec6aef53e9770ad319\n" +
            "53c81b1967f97cdf6b968ce78774a2a2\n" +
            "2382052c8740b0cc5f5a9c2375ee9c96\n" +
            "4270772b371accb38feccf3384db5e35\n" +
            "c499d6dcf476ce0a85eb5ff29759c24e\n" +
            "d8c18e4546ecedc43723eabb0f07ef83\n" +
            "a655152fe56ce24e02414cd78a6afb38\n" +
            "7121bd049a74d544ae3a4fabd4c1a808\n" +
            "-----END OpenVPN Static key V1-----\n" +
            "</tls-auth>\n" +
            "management 127.0.0.1 8888\n" +
            "management 127.0.0.1 8888";

}
