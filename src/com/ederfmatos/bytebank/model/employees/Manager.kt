package com.ederfmatos.bytebank.model.employees

class Manager(
        name: String,
        cpf: String,
        salary: Double,
        private val password: String
) : Employee(name = name, cpf = cpf, salary = salary) {

    fun authenticate(password: String): Boolean {
        return this.password == password
    }

    override val putBonus: Double
        get() = salary * 0.1 + salary

    override fun toString(): String {
        return "Manager(password='$password', putBonus=$putBonus, ${super.toString()})"
    }


}