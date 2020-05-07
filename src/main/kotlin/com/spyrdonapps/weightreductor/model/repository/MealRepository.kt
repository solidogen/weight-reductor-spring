package com.spyrdonapps.weightreductor.model.repository

import com.spyrdonapps.weightreductor.model.entity.Meal
import com.spyrdonapps.weightreductor.model.entity.Product
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.Repository
import org.springframework.transaction.annotation.Transactional
import java.time.LocalDate

interface MealRepository : Repository<Meal, Int> {

    @Transactional(readOnly = true)
    fun findAll(): List<Meal>

    fun save(meal: Meal)

    fun findMealById(id: Int): Meal

    fun findMealsByDate(date: LocalDate): List<Meal>
}