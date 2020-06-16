package top.cyixlq.example.bean

inline fun company(buildCompany: Company.Builder.() -> Unit): Company {
    val builder = Company.Builder()
    // Since `buildCompany` is an extension function for Company.Builder,
    // buildCompany() is called on the Company.Builder object.
    builder.buildCompany()
    return builder.build()
}

inline fun Company.Builder.employee(
    buildEmployee: Employee.Builder.() -> Unit
) {
    val builder = Employee.Builder()
    builder.buildEmployee()
    addEmployee(builder)
}

inline fun Company.Builder.office(buildOffice: Office.Builder.() -> Unit) {
    val builder = Office.Builder()
    builder.buildOffice()
    addOffice(builder)
}