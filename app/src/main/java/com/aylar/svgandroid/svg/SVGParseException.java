

package com.aylar.svgandroid.svg;

import org.xml.sax.SAXException;

/**
 * Thrown by the parser if a problem is found in the SVG file.
 */

public class SVGParseException extends SAXException
{
   SVGParseException(String msg)
   {
      super(msg);
   }

   SVGParseException(String msg, Exception cause)
   {
      super(msg, cause);
   }
}
