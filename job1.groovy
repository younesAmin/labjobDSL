job('exampledsl1') {
  scm {
    git('https://github.com/younesAmin/labjobDSL.git'){ node ->
      node / gitConfigName('jobDSL')
      node / gitCinfigEmail('uhyounes@gmail.com')
       
 }
  }
  steps {
    shell("echo hellodsl")
  }
}
