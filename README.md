# ايه هو البرنامج ده؟
- البرنامج ده هو عباره عن مثال لل Strategy Design Pattern باستخدام لغة java
# بنستخدم امتي ال Design Pattern ده؟
- لما يكون عندي object بيعمل عمليه معينه و جواه بيستخدم object تاني فيه ال algorithm لعمل العمليه دي .. وقتها بنستخدم ال design pattern ده عشان نقدر نغير ال algorithm ده في اي وقت
# الفرق بين ال strategy design pattern و ال command design pattern؟
  - ال strategy design pattern بيقوم بتحديد طريقة عمل او ال algorithm لعمل عمليه معينه (هعمل ازاي؟)
  - ال command design pattern بتقوم بتحديد ايه هي العمليه اللي هتتعمل (هعمل ايه؟) 
# بيتكون من ايه البرنامج ده ؟
- ال package بتاعت ال entities:
  - ال package بتاعت ال strategies:
    - ال PaymentMethod Interface و ده فيه ال methods اللي المفروض تكون في اي payment method
    - ال CreditCardPayment Interface و ده فيه ال methods اللي المفروض تكون في اي payment method
  - ال Order Class و ده ال class اللي بيستخدم ال strategy design pattern عشان يعمل عملية الدفع
