package com.tatwadeep.player

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tatwadeep.player.handler.PlayerListObserver
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        PlayerListObserver.instance?.registerLifecycle(lifecycle)
        a_main_audio_player1.setAudioTarget("https://p.scdn.co/mp3-preview/a74efdaa12f708673a14fdf67bfb6ec365d8ebf0?cid=96fac036ea6347f49035fb49be1e1d14")
        a_main_audio_player2.setAudioTarget("https://p.scdn.co/mp3-preview/d53d5678b946219bd6df0b3d04ce0b3554f167d4?cid=96fac036ea6347f49035fb49be1e1d14")
        a_main_audio_player3.setAudioTarget("https://p.scdn.co/mp3-preview/d53d5678b946219bd6df0b3d04ce0b3554f167d4?cid=96fac036ea6347f49035fb49be1e1d14")

    }
}
