package edu.ucne.pedrovladimir_p1_ap2.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import edu.ucne.pedrovladimir_p1_ap2.data.local.dao.Dao
import edu.ucne.pedrovladimir_p1_ap2.data.local.entity.Entity

@Database(
    entities = [Entity::class],
    version = 1,
    exportSchema = false
)
abstract class DataBase : RoomDatabase() {
    abstract fun Dao(): Dao
}