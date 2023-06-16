package com.example.contactapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactapp.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var contactList: List<Contact> = emptyList()
    private lateinit var adapter: ContactAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        createContactList() // Call createContactList here to populate the contactList
    binding.recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = ContactAdapter(contactList)
    binding.recyclerView.adapter = adapter




    }

    override fun onResume() {
        super.onResume()
        createContactList()
        binding.btnAdd.setOnClickListener {
            val intent = Intent(this,AddContact::class.java)
            startActivity(intent)
        }
        createContactList()
    }
    private fun createContactList() {
        val contact1 = Contact(
            "Nyeliep Giel",
            "0113704422",
            "gnyeliep@gmail.com",
            "https://images.unsplash.com/photo-1543610892-0b1f7e6d8ac1?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MjF8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"
        )
        val contact2 = Contact(
            "Daniel Giel ",
            "0734657210",
            "gielpal@gamil.com",
            "https://images.unsplash.com/photo-1520592978680-efbdeae5d036?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTB8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"
        )
        val contact3 = Contact(
            "Nyabhan Giel ",
            "0734657210",
            "gielpal@gamil.com",
            "https://images.unsplash.com/photo-1591727884968-cc11135a19b3?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8ODl8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"
        )
        val contact4 = Contact(
            "Wargak Giel ",
            "0734657210",
            "gielpal@gamil.com",
            "https://images.unsplash.com/photo-1520592978680-efbdeae5d036?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTB8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"
        )
        val contact5 = Contact(
            "Giel Pal ",
            "0734657210",
            "gielpal@gamil.com",
            "https://images.unsplash.com/photo-1520592978680-efbdeae5d036?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTB8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"
        )
        val contact6 = Contact(
            "Becky Giel ",
            "0734657210",
            "gielpal@gamil.com",
            "https://images.unsplash.com/photo-1520592978680-efbdeae5d036?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTB8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"
        )
        val contact7 = Contact(
            "Manu Giel ",
            "0734657210",
            "gielpal@gamil.com",
            "https://images.unsplash.com/photo-1520592978680-efbdeae5d036?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTB8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"
        )
        val contact8 = Contact(
            "Job Giel ",
            "0734657210",
            "gielpal@gamil.com",
            "https://images.unsplash.com/photo-1520592978680-efbdeae5d036?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTB8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"
        )
        val contact9 = Contact(
            "Tek Giel ",
            "0734657210",
            "gielpal@gamil.com",
            "https://images.unsplash.com/photo-1626847152035-cb3f14d8534b?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Njl8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"
        )
        val contact10 = Contact(
            "Nyamal Giel ",
            "0734657210",
            "gielpal@gamil.com",
            "https://images.unsplash.com/photo-1520592978680-efbdeae5d036?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTB8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"
        )
        val contact11 = Contact(
            "Johnny Giel ",
            "0734657210",
            "gielpal@gamil.com",
            "https://images.unsplash.com/photo-1520592978680-efbdeae5d036?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTB8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60"
        )
        val contact12 = Contact(
            "Nyekhan Giel ",
            "0734657210",
            "gielpal@gamil.com",
            "  https://images.unsplash.com/photo-1606914707708-5180546f153d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NTN8fHByb2ZpbGUlMjBwaWN0dXJlc3xlbnwwfHwwfHx8MA%3D%3D&auto=format&fit=crop&w=500&q=60\n"
        )


        contactList = listOf(contact1, contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10,contact11,contact12)

//        contactList.clear() // Clear the list before adding new contacts
//        contactList.addAll(listOf(contact1)) // Add contacts to the list
        // Add other contacts here
        adapter.notifyDataSetChanged()
    }

}

