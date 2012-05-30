all:
	pdflatex main.tex 
	pdflatex main.tex # compila due volte per i riferimenti
	rm -f *.aux *.log *.out *.toc *~
	rm -f caps/*.aux caps/*.pdf caps/*.log
	rm -f language.dvi language.synctex.gz language.ps
clean:
	rm -f *.aux *.log *.out *.toc *~
	rm -f caps/*.aux caps/*.pdf caps/*.log
	rm -f language.dvi language.synctex.gz language.ps language.pdf