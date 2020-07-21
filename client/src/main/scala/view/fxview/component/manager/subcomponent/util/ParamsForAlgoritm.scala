package view.fxview.component.manager.subcomponent.util

import java.time.LocalDate

import caseclass.CaseClassDB.{GiornoInSettimana, Terminale}

case class ParamsForAlgoritm(dateI: LocalDate, dateF: LocalDate, terminals: List[Terminale],
                             roleS: Boolean = false, name: Option[String] = None,
                             request: Option[List[GiornoInSettimana]] = None)
