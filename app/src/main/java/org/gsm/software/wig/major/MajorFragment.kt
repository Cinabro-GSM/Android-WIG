package org.gsm.software.wig.major

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.gsm.software.wig.R

class MajorFragment : Fragment() {

    companion object {
        fun newInstance() = MajorFragment()
    }

    private lateinit var viewModel: MajorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.major_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MajorViewModel::class.java)
        // TODO: Use the ViewModel
    }

}