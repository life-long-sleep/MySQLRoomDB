package com.mad.mysqlroomdb.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProductDao {

    @Insert
    fun insertProduct(p:Product)

    @Query("Delete FROM product_table")
    fun clear()

    @Query("SELECT * FROM product_table")
    fun getAll():List<Product>

    @Query("SELECT * FROM product_table where price < :price")
    fun getPriceLessThan(price:Double):List<Product>
}