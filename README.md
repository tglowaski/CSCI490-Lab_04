# Lab04
1. In Android Studio, create a basic Android project called CSCI490-Lab_04
2. Add **.idea/** to the .gitignore file
3. Share the project to GitHub

## Creating a Webview
1. Create a branch called **webview**
    * git checkout -b webview
2. In **MainActivity.java** add the following lines of code inside the **onCreate()** method:
```
WebView webview = new WebView(this);
setContentView(webview);
```
3. Load any URL of your choice (that's appropriate) by calling **webview.loadURL("yourURL.com")**
4. Run on your Android device or emulator.
Challenge: How would you go to your Webview from MainActivity, i.e. Launch from a button click?

5. Commit and push into Github
    * git add .
    * git commit -m "webview lab"
    * git push origin webview


## Creating a URL Connection and retrieving content
1. Once your webview branch is pushed up to Github, checkout branch master
    * git checkout master
2. Create a branch called **urlconnection**
    * git checkout -b urlconnection
3. In **MainActivity.java** create a method that passes in a **String** and returns a **String**
    * The parameter will (eventually) be the URL **https://jsonplaceholder.typicode.com/users**
    * The resulting String will be a JSON list of users
    * Inside the method, create a URL with the input string
    * Open a URLConnection with the call **openConnection()**
    * Create an InputStreamReader and channel through a BufferedReader as discussed in class
    * The output of the BufferedReader.readLine() will be a String. Put that in a variable
    * Print the String with Log.i() and check the contents
    * Compare that with typing the URL into a web browser
Challenge: Use past JsonUtils and edit create a JSONObject

4. Commit and push into Github
    * git add .
    * git commit -m "url connection lab"
    * git push origin urlconnection
    
   
## AsyncTask
1. Once your urlconnection branch is pushed to Github create a branch called **asyncTask**
    * git checkout -b asyncTask
2. Create a new class that extends AsyncTask<String, Void, String> and @Override the doInBackground() and onPostExecute()
3. Create a TextView element on your UI and pass that in the constructor to your AsyncTask class
4. In **MainActivity.java** create an instance of your AsyncTask class
5. Move your URL code from last lab to the doInBackground() task
6. In the onPostExecute() set your TextView to a subString of the json that is returned. The subString should be from 10-23
7. Commit and push into Gitub
    * git add .
    * git commit -m "async task"
    * git push origin async
