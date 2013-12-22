import collection.JavaConverters._;

/**
 * Created with IntelliJ IDEA.
 * User: Dell Vostro 3460
 * Date: 22.12.13
 * Time: 17:58
 */
trait ScalaAndJavaCollectionConversion {

   implicit def convertListLong2Java(scalaList: List[scala.Long]) : java.util.List[java.lang.Long] = {
    scalaList.map(long2Long(_)).asJava
  }

}
