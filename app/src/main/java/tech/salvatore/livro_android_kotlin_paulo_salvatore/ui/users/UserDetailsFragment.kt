package tech.salvatore.livro_android_kotlin_paulo_salvatore.ui.users

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import tech.salvatore.livro_android_kotlin_paulo_salvatore.R
import tech.salvatore.livro_android_kotlin_paulo_salvatore.viewmodel.creatures.CreaturesViewModel

class UserDetailsFragment : Fragment() {

    companion object {
        fun newInstance() = UserDetailsFragment()
    }

    private lateinit var viewModel: CreaturesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.users_details_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(CreaturesViewModel::class.java)
    }
}
