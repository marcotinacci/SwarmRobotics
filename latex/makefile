all:
	pdflatex main.tex
	bibtex main.aux
	pdflatex main.tex
	pdflatex main.tex
	rm -f *.aux *.log *.out *.toc *.bbl *.blg *.dvi *~
	rm -f caps/*.aux caps/*.pdf caps/*.log
	rm -f inc/*.aux
	rm -f main.dvi main.synctex.gz main.ps main.run.xml main-blx.bib
clean:
	rm -f *.aux *.log *.out *.toc *.bbl *.blg *~
	rm -f caps/*.aux caps/*.pdf caps/*.log
	rm -f main.dvi main.synctex.gz main.ps main.pdf