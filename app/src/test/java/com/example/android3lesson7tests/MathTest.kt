package com.example.android3lesson7tests

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

    var math: Math? = null

    @Before
    fun setup(){
        math = Math()
    }

    @Test
    fun simpleAddTest(){
        assertEquals("4",math?.add("2", "2"))
    }

    @Test
    fun simpleEmptyTest(){
        assertEquals("Поле не заполнено",math?.add("2", ""))
    }

    @Test
    fun simpleDoubleTest(){
        assertEquals("4.0",math?.add("2.0", "2.0"))
    }

    @Test
    fun zeroDoubleTest(){
        assertEquals("9.8",math?.add("4.2", "5.6"))
    }

    @Test
    fun negativeDoubleTest(){
        assertEquals("Отрицательные числа не складываются",math?.add("2", "-3"))
    }

    @Test
    fun symbolDoubleTest(){
        assertEquals("Символы не складываются",math?.add("asasasasa", "4"))
    }


    @Test
    fun simpleDivide(){
        assertEquals("3",math?.divide("9", "3"))
    }

    @Test
    fun zeroDivide(){
        assertEquals("Нельзя делить на ноль",math?.divide("9", "0"))
    }

    @After
    fun detach(){
        math = null
    }
}