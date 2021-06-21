job('exampledsl1') {
  scm {
    git('git@github.com:younesAmin/labjobDSL.git'){ node ->
      node / gitConfigName('jobDSL')
      node / gitCinfigEmail('uhyounes@gmail.com')
       
 }
  }
  steps {
    shell("echo hellodsl")
  }
}
