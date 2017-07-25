(ns hexadecimal-test
  (:require [clojure.test :refer :all]
            [hexadecimal :refer :all]))

(deftest hex-to-int-test
  (is (= 1 (hexadecimal/hex-to-int "1"))))
