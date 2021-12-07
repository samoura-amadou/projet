package fr.epsi.epsig2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class StudentAdapter (private val students: ArrayList<Student>): RecyclerView.Adapter<StudentAdapter.ViewHolder>(){

    class ViewHolder (view: View) : RecyclerView.ViewHolder(view){
        val textViewName = view.findViewById<TextView>(R.id.textViewName)
        val textViewEmail = view.findViewById<TextView>(R.id.textViewEmail)
        val textViewPhone = view.findViewById<TextView>(R.id.textViewPhone)
        val textViewZipcode = view.findViewById<TextView>(R.id.textViewZipcode)
        val textViewCity = view.findViewById<TextView>(R.id.textViewCity)
        val imageViewStudent = view.findViewById<ImageView>(R.id.imageViewStudent)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.cell_student, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val student = students.get(position)
        holder.textViewName.text=student.name
        holder.textViewEmail.text=student.email
        holder.textViewPhone.text=student.phone
        holder.textViewCity.text=student.city
        holder.textViewZipcode.text=student.zipcode

        Picasso.get().load(student.imgUrl).into(holder.imageViewStudent)
    }

    override fun getItemCount(): Int {
        return students.size
    }
}