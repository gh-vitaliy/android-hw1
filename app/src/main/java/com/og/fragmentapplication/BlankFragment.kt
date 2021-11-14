package com.og.fragmentapplication

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

private const val LYRICS_TAG = "LYRICS_TAG"

class BlankFragment : Fragment() {

    private val lyrics = listOf(
        "Месяц рожу полощет в луже,\n",
        "С неба светит лиловый сатин.\n",
        "Я стою никому не нужен,\n",
        "Одинокий и пьяный, один.\n",
        "А хорошего в жизни мало,\n",
        "Боль не тонет в проклятом вине,\n",
        "Даже та, что любил, перестала\n",
        "Улыбаться при встрече мне.\n",
        "А за что? А за то, что пью я,\n",
        "Разве можно за это ругать,\n",
        "Коль на этой на пьяной планете\n",
        "Родила меня бедная мать.\n",
        "Я стою никому не нужен,\n",
        "Одинокий и пьяный, один.\n",
        "Месяц рожу полощет в луже,\n",
        "С неба светит лиловый сатин."
    )


    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(LYRICS_TAG, lyrics[0] + lyrics[1])
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(LYRICS_TAG, lyrics[2])
    }

    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(LYRICS_TAG, lyrics[3])
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(LYRICS_TAG, lyrics[4])
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d(LYRICS_TAG, lyrics[5])
    }

    override fun onStart() {
        super.onStart()
        Log.d(LYRICS_TAG, lyrics[6])
    }

    override fun onResume() {
        super.onResume()
        Log.d(LYRICS_TAG, lyrics[7])
    }

    override fun onPause() {
        super.onPause()
        Log.d(LYRICS_TAG, lyrics[8])
    }

    override fun onStop() {
        super.onStop()
        Log.d(LYRICS_TAG, lyrics[9] + lyrics[10])
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(LYRICS_TAG, lyrics[11] + lyrics[12])
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(LYRICS_TAG, lyrics[13] + lyrics[14])
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(LYRICS_TAG, lyrics[15])
    }

}
