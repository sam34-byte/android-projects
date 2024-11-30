package com.theandroidfactory.SeasonTwo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val distroTileList = getDistroList()
        val distroTileAdapter = DistroTileAdapter(distroTileList)
        val recyclerView = findViewById<RecyclerView>(R.id.rV)

        recyclerView.adapter = distroTileAdapter

        distroTileAdapter.notifyDataSetChanged()

    }

    private fun getDistroList():ArrayList<DistroTile>{
        return ArrayList<DistroTile>().apply{
            add(
                DistroTile(
                    id = "ubuntu",
                    headerImgResId = R.drawable.ubuntu_logo,
                    title = "Ubuntu",
                    description = "Description of the Distro",
                    descriptionLong = "Ubuntu is a Linux distribution derived from Debian and composed mostly of free and open-source software.",
                    buttonText = "Learn More",
                    headerImageUrl = "https://en.wikipedia.org/wiki/Ubuntu#/media/File:Ubuntu-logo-2022.svg"
                )
            )
            add(
                DistroTile(
                    id = "debian",
                    headerImgResId = R.drawable.debian_logo,
                    title = "Debian",
                    description = "Description of the Distro",
                    descriptionLong = "Debian , also known as Debian GNU/Linux, is a free and open source Linux distribution, developed by the Debian Project, which was established by Ian Murdock in August 1993.",
                    buttonText = "Learn More",
                    headerImageUrl = "https://en.wikipedia.org/wiki/Debian#/media/File:Debian-OpenLogo.svg"
                )
            )
            add(
                DistroTile(
                    id = "archlinux",
                    headerImgResId = R.drawable.archlinux_logo,
                    title = "Arch Linux",
                    description = "Description of the Distro",
                    descriptionLong = "Arch Linux is an independently developed x86-64 general-purpose Linux distribution that strives to provide the latest stable versions of most software by following a rolling-release model.",
                    buttonText = "Learn More",
                    headerImageUrl = "https://en.wikipedia.org/wiki/Arch_Linux#/media/File:Archlinux-logo-standard-version.svg"
                )
            )
            add(
                DistroTile(
                    id = "fedora",
                    headerImgResId = R.drawable.fedora_logo,
                    title = "Fedora",
                    description = "Description of the Distro",
                    descriptionLong = "Fedora Linux is a Linux distribution developed by the Fedora Project. It was originally developed in 2003 as a continuation of the Red Hat Linux project. It contains software distributed under various free and open-source licenses and aims to be on the leading edge of open-source technologies.",
                    buttonText = "Learn More",
                    headerImageUrl = "https://en.wikipedia.org/wiki/Fedora_Linux#/media/File:Fedora_logo_(2021).svg"
                )
            )
        }
    }
}