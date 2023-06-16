package com.example.contactapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contactapp.databinding.ItemContactBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation


class ContactAdapter(var contactList: List<Contact>) :
    RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding = ItemContactBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        val contact = contactList[position]
        val binding = holder.bind(contact)


    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    inner class ContactViewHolder(private val binding: ItemContactBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(contact: Contact) {
            binding.tvContactName.text = contact.name
            binding.tvPhoneNumber.text = contact.phoneNumber
            binding.tvEmailAddress.text = contact.emailAddress

            Picasso
                .get()
                .load(contact.avatar)
                .transform(CropCircleTransformation())
                .into(binding.ivImg)
        }
    }

}
