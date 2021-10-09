package tech.salvatore.livro_android_kotlin_paulo_salvatore.model.source.local.db.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Flowable
import io.reactivex.rxjava3.core.Single
import tech.salvatore.livro_android_kotlin_paulo_salvatore.model.source.local.db.entity.CreatureEntity

@Dao
interface CreatureDao {
    @Query("SELECT COUNT(id) FROM creature")
    fun count(): Flowable<Int>

    @Query("SELECT * FROM creature")
    fun findAll(): Flowable<List<CreatureEntity>>

    @Query("SELECT * FROM creature WHERE id IN (:creatureIds)")
    fun findAllByIds(creatureIds: IntArray): Flowable<List<CreatureEntity>>

    @Query(
        "SELECT * FROM creature WHERE number LIKE :number LIMIT 1"
    )
    fun findByNumber(number: Int): Flowable<CreatureEntity>

    @Insert
    fun insertAll(vararg creatures: CreatureEntity): Completable

    @Delete
    fun delete(creature: CreatureEntity): Single<Int>
}
