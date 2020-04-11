package com.ashwin.android.jetpacknavigationsafeargs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_next.*

class NextFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_next, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Get the safe-args (String) message and (User) user
        val args: NextFragmentArgs = NextFragmentArgs.fromBundle(arguments ?: Bundle.EMPTY)
        val message = args.message
        val user = args.user

        message_textview.text = "$message $user"
    }
}
