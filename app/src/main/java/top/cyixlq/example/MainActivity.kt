package top.cyixlq.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import top.cyixlq.cmvvm.CMVVM
import top.cyixlq.example.bean.Company
import top.cyixlq.example.bean.company
import top.cyixlq.example.bean.employee
import top.cyixlq.example.bean.office

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CMVVM.init(application) {
            networkConfig {
            }
        }
    }
    fun buildBadCompany(): Company {
        return company {
            employee {
                setFirstName("Doug")
                setLastName("Sigelbaum")
                setIsManager(false)
                setManagerId("XXX")
                employee {
                    setFirstName("Sean")
                    setLastName("Mcq")
                    setIsManager(false)
                    setManagerId("XXX")
                }
            }
            office {

            }
            office {
                setAddress("San Francisco")
                setCapacity(2500)
                setOccupancy(2400)
            }
        }
    }
}
