package org.gsm.software.wig.department

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.gsm.software.wig.R

class DepartMentFragment : Fragment() {

    companion object {
        fun newInstance() = DepartMentFragment()
    }

    private lateinit var viewModel: DepartMentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.depart_ment_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(DepartMentViewModel::class.java)
        // TODO: Use the ViewModel
    }

}