package com.example.contactapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var contactList: List<Contact>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        contactList = createContactList()
        val adapter = ContactAdapter(contactList)
        binding.recyclerView.adapter = adapter
    }

    private fun createContactList(): List<Contact> {
        val contacts = mutableListOf<Contact>()

        contacts.add(Contact("Nyeliep Giel", "0134678213", "giel@gmail.com", R.drawable.gielnyeliep))
        contacts.add(Contact("Tek Giel", "0112654321", "tek@gmail.com", R.drawable.gielnyeliep))
        contacts.add(Contact("Jop Giel", "0734543210", "j@gmail.com", R.drawable.gielnyeliep))
        contacts.add(Contact("Nyemal Giel", "0134678213", "mal@gmail.com", R.drawable.gielnyeliep))
        contacts.add(Contact("Becky Giel", "0112654321", "bec@gmail.com", R.drawable.gielnyeliep))
        contacts.add(Contact("Johnny Giel", "0734543210", "j@gmail.com", R.drawable.gielnyeliep))

        return contacts
    }
}


