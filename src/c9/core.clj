(ns c9.core
  (:require [clojure.java.jdbc :as j]))

(def db-settings
  {
   :classname "org.h2.Driver"
   :subprotocol "h2:mem" ;; in-memory
   :subname "c9inst;DB_CLOSE_DELAY=-1"
   :user "sa"
   :password ""
   })
