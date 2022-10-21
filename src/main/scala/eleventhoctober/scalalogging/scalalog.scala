package eleventhoctober.scalalogging

import com.typesafe.scalalogging.LazyLogging

object helloWorldWithLog extends App with LazyLogging{
  logger.error("Hello !")
}


