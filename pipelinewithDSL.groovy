job('pipeline-with-DSL') {
 description("this pipeline is created eith a jobDSL")
 scm {
  git("https://github.com/younesAmin/labjobDSL.git", 'main')
 }
}
