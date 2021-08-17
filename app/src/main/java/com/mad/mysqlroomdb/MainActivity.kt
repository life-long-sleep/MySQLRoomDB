package com.mad.mysqlroomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.mad.mysqlroomdb.data.Product
import com.mad.mysqlroomdb.data.ProductDB
import com.mad.mysqlroomdb.data.ProductDao
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    lateinit var dao : ProductDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.btnInsert)
        dao =  ProductDB.getInstance(application).productDao

        btn.setOnClickListener(){
            val p = Product(0, "Apple",1.50)
            CoroutineScope(IO).launch{
                dao.insertProduct(p)
            }


        }
    }
}