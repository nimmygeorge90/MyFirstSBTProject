package eleventhoctober

import com.typesafe.scalalogging.LazyLogging

object helloworldwithlog extends App with LazyLogging {
  logger.error("Hello !")
}
