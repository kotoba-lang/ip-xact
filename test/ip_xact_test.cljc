(ns ip-xact-test
  (:require [clojure.test :refer [deftest is testing]]
            [ip-xact]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? (the-ns 'ip-xact)))))
