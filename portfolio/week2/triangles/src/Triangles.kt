// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: Triangle): Boolean {

    val a = triangle.first
    val b = triangle.second
    val c = triangle.third

        if ( a >= b+c ||  a <= 0 || b >= a+c || b <= 0 || c >= a+b || c <= 0) {
        return false
        }
    return true
    }

    fun triangleArea(triangle: Triangle): Double { 
       
        val a = triangle.first
        val b = triangle.second
        val c = triangle.third

        val s: Double = (a+b+c)/2
        val area: Double = sqrt(s*(s-a)*(s-b)*(s-c))

        return area
    }

fun main() {

    val triangle: Triangle = Triple(3.0, 4.0, 5.0)

    val area = triangleArea(triangle)
    
}