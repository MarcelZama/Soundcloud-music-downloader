# SoundCloud Music Downloader Documentation  

### Overview  
  
&nbsp;&nbsp;&nbsp;This project allows users to download music from SoundCloud by extracting song titles from playlist or liked song elements and downloading them automatically. The process involves:  
  
&nbsp;&nbsp;&nbsp;Copying the HTML element containing the song list from SoundCloud's inspect mode.  
  
&nbsp;&nbsp;&nbsp;Pasting the copied content into input.txt.  
  
&nbsp;&nbsp;&nbsp;Running SongExtractor.java to extract song titles into songs.txt.  
  
&nbsp;&nbsp;&nbsp;Running downloader.py to download the listed songs as audio files.  
<br>
### Requirements  
  
&nbsp;&nbsp;&nbsp;Java Setup  
  
&nbsp;&nbsp;&nbsp;Install Java Development Kit (JDK)  

&nbsp;&nbsp;&nbsp;Add Java to your system's PATH for easy execution  

&nbsp;&nbsp;&nbsp;Python Setup  

&nbsp;&nbsp;&nbsp;Install Python (3.x recommended)  

&nbsp;&nbsp;&nbsp;Install required libraries using pip:  

&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;pip install yt-dlp  

&nbsp;&nbsp;&nbsp;Ensure ffmpeg is installed for audio conversion. You can install it via(You might have to install an older version of ffmpeg):  

&nbsp;&nbsp;&nbsp;"https://www.youtube.com/watch?v=JR36oH35Fgg"   

&nbsp;&nbsp;&nbsp;Windows: Download from ffmpeg.org and add it to PATH.  

&nbsp;&nbsp;&nbsp;Linux: Install via package manager (e.g., sudo apt install ffmpeg).  
<br>
### File Structure  

&nbsp;&nbsp;&nbsp;├── **Songs**  
&nbsp;&nbsp;&nbsp;├── **Downloader.py**  
&nbsp;&nbsp;&nbsp;├── **SongExtractor.java**  
&nbsp;&nbsp;&nbsp;├── **input.txt**  
&nbsp;&nbsp;&nbsp;├── **songs.txt**  
&nbsp;&nbsp;&nbsp;├── **songstest.txt**   
  <br><br>
-> Step 1: Extract Song Data from SoundCloud  
  
&nbsp;&nbsp;&nbsp;Open your SoundCloud playlist or liked songs.  
  
&nbsp;&nbsp;&nbsp;Right-click on the song list and select Inspect (or press Ctrl + Shift + I).  
  
&nbsp;&nbsp;&nbsp;Locate the HTML element that contains the song list (typically a `<div>` or `<ul>` structure).  
  
&nbsp;&nbsp;&nbsp;Copy the entire HTML element and paste it into input.txt.  
  <br><br>
-> Step 2: Extract Song Titles  

&nbsp;&nbsp;&nbsp;Open a command prompt or terminal.  
  
&nbsp;&nbsp;&nbsp;Navigate to the folder containing your project files.  
   
&nbsp;&nbsp;&nbsp;Run the following command to execute SongExtractor.java:  
  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;javac SongExtractor.java  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;java SongExtractor  
  
&nbsp;&nbsp;&nbsp;This will generate a songs.txt file containing the extracted song titles.  
  <br><br>
-> Step 3: Test the Downloader  
  
&nbsp;&nbsp;&nbsp;Before downloading all the songs, test a small sample:  
  
&nbsp;&nbsp;&nbsp;Copy a few titles from songs.txt into songstest.txt.  
  
&nbsp;&nbsp;&nbsp;Open Downloader.py and change the song list file path to songstest.txt:  
  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;download_songs('----------------------\\songstest.txt')  
  
&nbsp;&nbsp;&nbsp;Run the downloader:  
  
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;python Downloader.py  
   
&nbsp;&nbsp;&nbsp;Confirm that the songs download correctly.  
  <br><br>
-> Step 4: Download Full Playlist   
   
&nbsp;&nbsp;&nbsp;Once you've verified that the downloader works:   
   
&nbsp;&nbsp;&nbsp;Change the file path in Downloader.py back to songs.txt.  
  
&nbsp;&nbsp;&nbsp;Run the downloader again to download the complete playlist:  
   
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;python Downloader.py  
    
&nbsp;&nbsp;&nbsp;Notes and Recommendations  
  
&nbsp;&nbsp;&nbsp;Always test with songstest.txt first to avoid wasting time with incorrect entries.  
<!-- Blank line -->
<!-- Blank line -->
<!-- Blank line -->
<!-- Blank line -->
<!-- Blank line -->
<!-- Blank line -->
<br><br><br><!-- Blank line -->
&nbsp;&nbsp;&nbsp;P.S: once you got it running is not hard to modify it and to get songs from other platforms too.
<br><br>
### Disclaimer   
   
This tool is intended for personal use only. Please ensure you comply with SoundCloud's terms of service when using this project.   
  
