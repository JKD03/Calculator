import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.jkdprojects.simplecalculator.R

class InfoScreen : DialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        var rootView: View = inflater.inflate(R.layout.info,container,false)
        return rootView
    }

}