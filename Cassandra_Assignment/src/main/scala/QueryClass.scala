import com.datastax.driver.core.Cluster

/**
  * Created by knoldus on 4/4/17.
  */
class QueryClass {

  val cluster = Cluster.builder().addContactPoint("127.0.0.1").build()

  val session = cluster.connect("database")

  def userByEmail(email:String) = {

    val res = session.execute(s"SELECT * FROM user where email='$email'")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      println(iterate.next())

    }
    println()
  }

  def videoByName(name:String) = {

    val res = session.execute(s"SELECT * FROM videobyname where video_name='$name'")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      println(iterate.next())

    }
    println()
  }

  def videoByUseridYear(id:Int,year:Int) = {

    val res = session.execute(s"SELECT * FROM videobyuseridnyear where userid=$id AND year>$year")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      println(iterate.next())

    }
    println()
    //cluster.close()
  }

  def videoByUseridYearDesc(id:Int,year:Int) = {

    val res = session.execute(s"SELECT * FROM videobyuseridnyear where userid=$id AND year>$year ORDER BY year DESC")

    val iterate = res.iterator()

    while (iterate.hasNext) {

      println(iterate.next())

    }
    println()
    cluster.close()
  }
}
