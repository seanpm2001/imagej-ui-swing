
package net.imagej.plot;

import net.imagej.table.Table;

import org.scijava.plugin.Plugin;
import org.scijava.service.AbstractService;
import org.scijava.service.Service;

// TODO: consider extending WrapperService, and making Plot into a WrapperPlugin
@Plugin(type = Service.class)
public class DefaultPlotService extends AbstractService implements PlotService {

	@Override
	public Plot create(final Table<?, ?> data, final PlotStyle style) {
		return new DefaultPlot(data, style);
	}
}