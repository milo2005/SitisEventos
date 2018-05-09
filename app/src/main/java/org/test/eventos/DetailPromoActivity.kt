package org.test.eventos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintSet
import android.support.transition.TransitionManager
import kotlinx.android.synthetic.main.activity_promotion_expanded.*
import org.test.eventos.models.Promocion
import org.test.eventos.provider.EventData

class DetailPromoActivity : AppCompatActivity() {

    val expanded:ConstraintSet = ConstraintSet()
    val collapsed:ConstraintSet = ConstraintSet()
    var fisrtState = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_promotion_expanded)

        expanded.clone(root)
        collapsed.clone(this, R.layout.activity_promotion)

        val pos = intent.extras.getInt("pos")
        val data = EventData.listEvents()[pos] as Promocion

        name.text = data.nombre
        profile.text = data.lugar
        img.setImageURI(data.imagen)
        imgProfile.setImageURI(data.lugarImagen)


        floatingActionButton.setOnClickListener{
            TransitionManager.beginDelayedTransition(root)
            if(fisrtState) collapsed.applyTo(root)
            else expanded.applyTo(root)
            fisrtState = !fisrtState
        }

    }
}
