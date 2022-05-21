(ns buckingham.convert-test
  (:require [clojure.test :refer :all]
            [buckingham.convert :refer :all]))

(deftest a-test
  (testing "celcius->fahrenheit conversion failed"
    (is (= 32 (celcius->fahrenheit 0)))
    (is (= 33 (celcius->fahrenheit 5/9)))))

(deftest b-test
  (testing "fahrenheit->celcius conversion failed"
    (is (= 0 (fahrenheit->celcius 32)))
    (is (= 5/9 (fahrenheit->celcius 33)))))

(deftest c-test
  (testing "celcius->kelvin conversion failed"
    (is (= 273.15 (celcius->kelvin 0)))
    (is (= 274.15 (celcius->kelvin 1)))))

(deftest d-test
  (testing "kelvin->celcius conversion failed"
    (is (= -273.15 (kelvin->celcius 0)))
    (is (= -272.15 (kelvin->celcius 1)))))

(deftest e-test
  (testing "kelvin->rankine conversion failed"
    (is (= 0.0 (kelvin->rankine 0)))
    (is (= 1.8 (kelvin->rankine 1)))))

(deftest f-test
  (testing "rankine->kelvin conversion failed"
    (is (= 0. (rankine->kelvin 0)))
    (is (= 1. (rankine->kelvin 1.8)))))

(deftest g-test
  (testing "at->bar conversion failed"
    (is (= 0.980665 (at->bar 1)))
    (is (= (* 2 0.980665) (at->bar 2)))))

(deftest h-test
  (testing "bar->at conversion failed"
    (is (= (/ 1 0.980665) (bar->at 1)))
    (is (= (/ 2 0.980665) (bar->at 2)))))

(deftest n-test
  (testing "atm->bar conversion failed"
    (is (= 1.01325 (atm->bar 1)))
    (is (= (* 2 1.01325 (atm->bar 2))))))


  



