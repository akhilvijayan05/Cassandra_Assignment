import com.datastax.driver.core.Cluster

/**
  * Created by knoldus on 4/4/17.
  */


object QueryObject extends App {

  val queryClass=new QueryClass
  queryClass.userByEmail("akhil@gmail.com")
  queryClass.videoByName("Jio Offer")
  queryClass.videoByUseridYear(100,2015)
  queryClass.videoByUseridYearDesc(100,2015)

}

