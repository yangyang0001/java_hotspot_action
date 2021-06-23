package com.deepblue.hotspot_inaction.chapter_03_klass;

import javax.lang.model.SourceVersion;
import javax.tools.Tool;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;

public class UseSystemDictionary implements Tool {

	@Override
	public int run(InputStream in, OutputStream out, OutputStream err, String... arguments) {
		return 0;
	}

	@Override
	public Set<SourceVersion> getSourceVersions() {
		return null;
	}
}
