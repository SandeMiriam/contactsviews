package com.example.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycontacts.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }

    fun displayContacts() {
        var contact1 = Contacts("Gentrix", "0741454086", "gentrix@gmail.com", "616 Korongoroad", "https://i.pinimg.com/236x/5e/f3/3f/5ef33fcb3c88ca532982b2ce13e2dbd4.jpg")
        var contact2 = Contacts("Shirlyne", "011513648", "shirlyne@gmail.com", "Komarocks", "https://i.pinimg.com/236x/5e/f3/3f/5ef33fcb3c88ca532982b2ce13e2dbd4.jpg")
        var contact3 = Contacts("Alice", "0726158629", "alice@gmail.com", "Komarocks phase3", "https://i.pinimg.com/236x/5e/f3/3f/5ef33fcb3c88ca532982b2ce13e2dbd4.jpg")
        var contact4 = Contacts("Jane", "0780025273", "janee@gmail.com", "Buruburu", "https://i.pinimg.com/236x/5e/f3/3f/5ef33fcb3c88ca532982b2ce13e2dbd4.jpg")
        var contact5 = Contacts("Meyer", "1243484906", "meyer@gmail.com", "Buruburu", "https://i.pinimg.com/564x/35/e0/a0/35e0a0205018063de1a93dabf717815c.jpg")
        var contact6=Contacts("Elly","0768501532","ellyb@gmail.com","ParkLands","https://i.pinimg.com/564x/ee/5a/ad/ee5aad0fd21e0b217a4bfe8c8bc486ad.jpg")
        var contact7=Contacts("Baron","0768501532","baronotieno@gmail.com","South B","https://i.pinimg.com/236x/25/a1/5a/25a15ab58fbe9da14d7efb85227525f7.jpg")
        var contact8=Contacts("Levis","0768501532","levisodhiambo@gmail.com","Westlands","https://i.pinimg.com/564x/35/e0/a0/35e0a0205018063de1a93dabf717815c.jpg")
        var contact9=Contacts("Sofia","0768501532","sofiabaraza@gmail.com","GreenFields","https://www.pinterest.com/pin/25966135343951982/")
        var contact10=Contacts("Wanjira","0768501532","whitneywanjira@gmail.com","Epren","https://i.pinimg.com/236x/9c/3a/21/9c3a21be85270c8cfddf903ae9abfc96.jpg")
        var contact11=Contacts("Floid","0768501532","floidoketch@gmail.com","Kasarani","https://www.pinterest.com/pin/1046383294644174277/")
        var contact12=Contacts("Ruth","0768501532","ruthnabwire@gmail.com","Doonholm","https://i.pinimg.com/236x/37/21/15/3721156d903fe62ec7d0d09b08ce7761.jpg")
        var contact13=Contacts("Mutuku","0768501532","denismutuku@gmail.com","Savannah","https://i.pinimg.com/236x/5e/f3/3f/5ef33fcb3c88ca532982b2ce13e2dbd4.jpg")

        var contactlist = listOf(contact1, contact2, contact3, contact4, contact5,contact6,contact7,contact8,contact9,contact10,contact11,contact12,contact13)
        var contactsAdapter = ContactRvAdapter(contactlist)
        binding.rvContacts.layoutManager = LinearLayoutManager(this)
        binding.rvContacts.adapter = contactsAdapter
    }
}