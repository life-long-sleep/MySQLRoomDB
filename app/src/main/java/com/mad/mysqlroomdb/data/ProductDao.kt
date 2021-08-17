package com.mad.mysqlroomdb.data

import androidx.room.Dao
import androidx.room.Insert

@Dao
interface ProductDao {

    @Insert
    fun insertProduct(p:Product)
}