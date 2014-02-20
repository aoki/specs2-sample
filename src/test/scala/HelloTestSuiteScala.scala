import org.junit.runner.RunWith
import org.junit.runners.Suite
import org.junit.runners.Suite.SuiteClasses

@RunWith(classOf[Suite])
@SuiteClasses(Array(classOf[HelloScalaSpec], classOf[HelloSpecSpec]))
class HelloTestSuiteScala
