def factorial(n: Int):Int = {
  if ( n == 0 )
    return 1
  else
    return n * factorial(n - 1)
}

println( factorial( args(0).toInt ) )
