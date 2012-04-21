(defproject cloto "0.0.1-SNAPSHOT"
  :description "FIXME"
  :dependencies [[org.clojure/clojure "1.3.0"]
                 [com.google.apis/google-api-services-freebase "v1-rev4-1.5.0-beta"]
                 [org.clojure/data.json "0.1.2"]
                 [org.clojure/tools.logging "0.2.3"]
                 [noir "1.2.1"]
                 [borneo "0.3.0"]
                 [stencil "0.3.0-preview1"]
;                 [markdown-clj "0.6"]
                 [org.markdownj/markdownj "0.3.0-1.0.2b4"]]
  :repositories {"scala-tools" "http://scala-tools.org/repo-releases"}

  :main cloto.server
  
  )