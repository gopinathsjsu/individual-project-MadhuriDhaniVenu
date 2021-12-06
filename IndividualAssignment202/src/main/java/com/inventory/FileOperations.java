package com.inventory;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.List;
public interface FileOperations {
  List<List<String>> readFile(File filename) throws IOException, SAXException, ParserConfigurationException;
  void writeFile(String filename , List<String> value) throws IOException;
}
