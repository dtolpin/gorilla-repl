;;;; This file is part of gorilla-repl. Copyright (C) 2014-, Jony Hudson.
;;;;
;;;; gorilla-repl is licenced to you under the MIT licence. See the file LICENCE.txt for full details.

(defproject dtolpin/gorilla-repl "0.4.1-SNAPSHOT"
  :description "A rich REPL for Clojure in the notebook style."
  :url "https://github.com/JonyEpsilon/gorilla-repl"
  :signing {:gpg-key "david.tolpin@gmail.com"}
  :license {:name "MIT"}
  :repositories [["releases" {:url "https://repo.clojars.org"
                            :creds :gpg}]]
  :dependencies ^:replace [[org.clojure/clojure "1.8.0"]
                           [http-kit "2.1.19"]
                           [ring/ring-json "0.4.0"]
                           [cheshire "5.4.0"]
                           [compojure "1.3.3"]
                           [org.slf4j/slf4j-api "1.7.12"]
                           [ch.qos.logback/logback-classic "1.1.3"]
                           [gorilla-renderable "2.0.0"]
                           [dtolpin/gorilla-plot "0.1.5-SNAPSHOT"]
                           [javax.servlet/servlet-api "2.5"]
                           [grimradical/clj-semver "0.3.0" :exclusions [org.clojure/clojure]]
                           [cider/cider-nrepl "0.18.0"]
                           [org.clojure/tools.nrepl "0.2.12"] 
                           [clojure-complete "0.2.4"]]
  :main ^:skip-aot gorilla-repl.core
  :target-path "target/%s")
