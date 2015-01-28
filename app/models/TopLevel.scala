package models

case class TopLevel(links: Option[Map[String,String]] = None,
                    emails: Option[Either[Email,Seq[Email]]] = None,
                    users: Option[User] = None,
                    tokens: Option[Token] = None,
                    errors: Option[Either[Error,Seq[Error]]] = None)
