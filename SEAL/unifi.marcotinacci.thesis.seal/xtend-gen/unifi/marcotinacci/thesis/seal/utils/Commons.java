package unifi.marcotinacci.thesis.seal.utils;

import com.google.common.base.Objects;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import org.eclipse.emf.common.CommonPlugin;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Commons {
  public static String getSrcGenURI(final Resource resource) {
    URI _uRI = resource.getURI();
    URI _resolve = CommonPlugin.resolve(_uRI);
    String _path = _resolve.path();
    File _file = new File(_path);
    final File srcFolder = _file;
    File _parentFile = srcFolder.getParentFile();
    return (_parentFile + "/../src-gen/");
  }
  
  public static String execute(final List<String> args) {
    try {
      Runtime _runtime = Runtime.getRuntime();
      Process process = _runtime.exec(((String[])Conversions.unwrapArray(args, String.class)));
      String result = "";
      String _plus = ("DEBUG - EXEC : " + args);
      InputOutput.<String>println(_plus);
      InputStream stdin = process.getInputStream();
      InputStreamReader _inputStreamReader = new InputStreamReader(stdin);
      InputStreamReader isr = _inputStreamReader;
      BufferedReader _bufferedReader = new BufferedReader(isr);
      BufferedReader br = _bufferedReader;
      String line = null;
      String _readLine = br.readLine();
      String _line = line = _readLine;
      boolean _notEquals = (!Objects.equal(_line, null));
      boolean _while = _notEquals;
      while (_while) {
        String _plus_1 = (result + line);
        String _plus_2 = (_plus_1 + "\n");
        result = _plus_2;
        String _readLine_1 = br.readLine();
        String _line_1 = line = _readLine_1;
        boolean _notEquals_1 = (!Objects.equal(_line_1, null));
        _while = _notEquals_1;
      }
      return result;
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
